Model element is the root class for all other model classes. 

It has ``path`` attribute which is used to compute model element's ``uri`` and also model element's URL in the UI.

It also has two attributes for authoring element descriptions - ``description`` and ``markdownDescription``.
If both attributes are present then the value of the ``description`` is concatenated with the renderd value of ``markdownDescription``.

### Authoring descriptions

This section outlines different options for authoring descriptions.

#### Inline

Inline descriptions are provided in YAML files themselves. The approach is convenient for relatively short descriptions, e.g. to quickly capture an [issue](Issue.html).

##### HTML

###### Single line

```yaml
- name: Sliding navigation panel
   description: Ability to hide if it takes too much real estate and then bring back. Navigation toggle context action with just an icon.       
```

###### Multi-line

```yaml
- name: Engineers feature action
  description: |+2
    Table with engineer name and stats - owns, expert, number of issues, number of messages.
    Provisions for additional stats - context service. E.g. number of commits.       
```

##### Markdown

Just use ``markdown-description`` key instead of ``description`` key.

###### Single line

```yaml
- name: Progress bars in for percentages
  markdown-description: "[Bootstrap progress bar](https://getbootstrap.com/docs/4.0/components/progress/#labels)"  
```

###### Multi-line

```yaml
- name: ModelElement tags
  markdown-description: |+2
    Property class - value (multi-string, default feature), description and markdown description. PropertyEntry class - String key, Property value.
    [EMap](https://wiki.eclipse.org/EMF/FAQ#How_do_I_create_a_Map_in_EMF.3F) tags at ModelElement level. Possible use - aliasing. Maybe name ``properties`` and use wider, e.g. to customize behavior.
    Render as a table in a feature action.                       
```

#### Loaded from a resource

Long descriptions are better kepts in their own files.
To do so, add ``exec-resource`` key with the value of a URL of the resource containing the element description. The URL is resolved relative to the current YAML file URL.

##### HTML

```yaml
- name: Sliding navigation panel
   description: 
     exec-resource: sliding-navigation-panel.txt       
```

##### Markdown

```yaml
- name: ModelElement tags
  markdown-description: 
    exec-resource: descriptions/model-element-tags.md 
```

#### Replacement tokens (Interpolation)

Description text may contain replacement tokens to simplify authoring, e.g. to cross-reference model elements using their URI's.
You may use context properties as tokens plus the tokens listed in the table below:

Token | Description | Example
----- | ----------- | -------
``base-uri`` | A relative path to the root of hte site without a trailing slash |  ``[Root](${{{base-uri}}}/index.html)``
``doc-uri`` | A relative path to the root of the documentation site with a trailing slash. This token is available only if the generation context has ``doc-uri`` property. | ``[Model Element](${{{doc-uri}}}engineering/ModelElement.html)``
``embedded-image/<image type>/<image URL> [<caption>]`` | Reads an image from the URL resolved relative to the model resource URL. Encodes as an embedded image. If there is a caption separated from the URL by a space, then the image is wrapped into a table with the caption below the image. | ``${{{embedded-image/png/logo.png}}}``, ``${{{embedded-image/png/my-screenshot.png Screenshot description}}}``
``embedded-image-data/<image type>/<image URL>]`` | Reads an image from the URL resolved relative to the model resource URL. Encodes as an embedded image data - the ``src`` attribute. Can be used to include images in markdown without HTML blocks. | ``![logo](${{{embedded-image-data/png/logo.png}}})``
``include/<resource URL>`` | Reads, interpolates, and includes a resource at the URL resolved relative to the model resource URL. | ``${{{include/report.html}}}``
``include-markdown/<resource URL>`` | Reads a resource at the URL resolved relative to the model resource URL. Renders Markdown to HTML. Interpolates and includes. | ``${{{include-markdown/report.md}}}``

#### Diagrams

[PlantUML](https://plantuml.com/) diagrams can be embedded into markdown using [fenced code blocks](https://www.markdownguide.org/extended-syntax/#fenced-code-blocks) with the following language specifications:

* ``uml`` - for the following diagram types:
    * [Sequence](https://plantuml.com/sequence-diagram), 
    * [Use Case](https://plantuml.com/use-case-diagram), 
    * [Class](https://plantuml.com/class-diagram), 
    * [Activity](https://plantuml.com/activity-diagram-beta), 
    * [Component](https://plantuml.com/component-diagram), 
    * [State](https://plantuml.com/state-diagram), 
    * [Object](https://plantuml.com/object-diagram), 
    * [Deployment](https://plantuml.com/deployment-diagram), 
    * [Timing](https://plantuml.com/timing-diagram), 
    * [Network](https://plantuml.com/nwdiag).
* ``wireframe`` - for [Wireframe diagrams](https://plantuml.com/salt)
* ``gantt`` - for [Gantt diagrams](https://plantuml.com/gantt-diagram)
* ``mindmap`` - for [Mind Maps](https://plantuml.com/mindmap-diagram)
* ``wbs`` - for [Work Breakdown Structures](https://plantuml.com/wbs-diagram)

##### Examples

###### UML Sequence

Fenced block:

	```uml
	Alice -> Bob: Authentication Request
	Bob --> Alice: Authentication Response
	```
	
Diagram:

```uml
Alice -> Bob: Authentication Request
Bob --> Alice: Authentication Response
```

###### UML Component

Component diagram with links to component pages.


Fenced block:

	```uml
    package Core {
       component Common [[https://docs.nasdanika.org/modules/core/modules/common/index.html]]
    }
    
    package HTML {
       component HTML as html [[https://docs.nasdanika.org/modules/html/modules/html/index.html]]
       [html] ..> [Common]
    }
	```
	
Diagram:

```uml
package Core {
   component Common [[https://docs.nasdanika.org/modules/core/modules/common/index.html]]
}

package HTML {
   component HTML as html [[https://docs.nasdanika.org/modules/html/modules/html/index.html]]
   [html] ..> [Common]
}
```

##### Wireframe

Fenced block:

	```wireframe
	{
	  Just plain text
	  [This is my button]
	  ()  Unchecked radio
	  (X) Checked radio
	  []  Unchecked box
	  [X] Checked box
	  "Enter text here   "
	  ^This is a droplist^
	}
	```


Diagram:

```wireframe
{
  Just plain text
  [This is my button]
  ()  Unchecked radio
  (X) Checked radio
  []  Unchecked box
  [X] Checked box
  "Enter text here   "
  ^This is a droplist^
}
```

##### Gantt

Fenced block:

	```gantt
	[Prototype design] lasts 15 days and links to [[https://docs.nasdanika.org/index.html]]
	[Test prototype] lasts 10 days
	-- All example --
	[Task 1 (1 day)] lasts 1 day
	[T2 (5 days)] lasts 5 days
	[T3 (1 week)] lasts 1 week
	[T4 (1 week and 4 days)] lasts 1 week and 4 days
	[T5 (2 weeks)] lasts 2 weeks
	```

Diagram:

```gantt
[Prototype design] lasts 15 days and links to [[https://docs.nasdanika.org/index.html]]
[Test prototype] lasts 10 days
-- All example --
[Task 1 (1 day)] lasts 1 day
[T2 (5 days)] lasts 5 days
[T3 (1 week)] lasts 1 week
[T4 (1 week and 4 days)] lasts 1 week and 4 days
[T5 (2 weeks)] lasts 2 weeks
```

##### Mind Map

Fenced block:

	```mindmap
	* Debian
	** [[https://ubuntu.com/ Ubuntu]]
	*** Linux Mint
	*** Kubuntu
	*** Lubuntu
	*** KDE Neon
	** LMDE
	** SolydXK
	** SteamOS
	** Raspbian with a very long name
	*** <s>Raspmbc</s> => OSMC
	*** <s>Raspyfi</s> => Volumio
	```

Diagram:

```mindmap
* Debian
** [[https://ubuntu.com/ Ubuntu]]
*** Linux Mint
*** Kubuntu
*** Lubuntu
*** KDE Neon
** LMDE
** SolydXK
** SteamOS
** Raspbian with a very long name
*** <s>Raspmbc</s> => OSMC
*** <s>Raspyfi</s> => Volumio
```

##### WBS

WBS elements can have links. This type of diagram can also be used to display organization structure.

	```wbs
	* [[https://docs.nasdanika.org/index.html Business Process Modelling WBS]]
	** Launch the project
	*** Complete Stakeholder Research
	*** Initial Implementation Plan
	** Design phase
	*** Model of AsIs Processes Completed
	**** Model of AsIs Processes Completed1
	**** Model of AsIs Processes Completed2
	*** Measure AsIs performance metrics
	*** Identify Quick Wins
	** Complete innovate phase
	```

Fenced block:


Diagram:

```wbs
* [[https://docs.nasdanika.org/index.html Business Process Modelling WBS]]
** Launch the project
*** Complete Stakeholder Research
*** Initial Implementation Plan
** Design phase
*** Model of AsIs Processes Completed
**** Model of AsIs Processes Completed1
**** Model of AsIs Processes Completed2
*** Measure AsIs performance metrics
*** Identify Quick Wins
** Complete innovate phase
```

#### Sections and Table of Contents

Long description can be broken down into multiple [sections](Document.html). 
If you use sections you can define a [table of contents](TableOfContents.html).
Note that in order for the table of contents links work [section-style](SectionStyle.html) shall be set to ``DEFAULT``.




---