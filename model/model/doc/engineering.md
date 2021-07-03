One of definitions of engineering is _"The action of working artfully to bring something about."_
Bringing something of value about is usually quite a lot of effort. 
In a situation of limited resources, which is the case most of the time, that efforts need to be carefully organized
to achieve the maximum bang for the buck.

The goal of Nasdanika Engineering is to help to carefully organize efforts in order to bring something about.
That "about" may be a software product, an organization, a vacation, or life in general.

Nasdanika Engineering provides science and tooling to guide and track the process of translating dreams and ideas into organizing thought,
sharing that organized thought with others and aligning efforts of many to turn dreams and ideas into reality.

Nasdanika Engineering takes a low-tech approach - all you need to use it is a text editor to author [YAML](https://en.wikipedia.org/wiki/YAML)
and [Markdown](https://en.wikipedia.org/wiki/Markdown) files. 

Shall YAML and Markdown sound scary for non-technical people, YAML is a glorified indented list - if you know how to create a PowerPoint slide with
bullet points, you should be able to manage YAML. And Markdown is pretty close to plain text.

YAML and Markdown are resource formats supported out-of-the box. If needed, model data can be loaded from other resources. 
E.g. [issues](Issue.html) can be loaded from issue trackers such as [GitHub Issues](https://guides.github.com/features/issues/), [Jira](https://www.atlassian.com/software/jira), or [MantisBT](https://www.mantisbt.org/)
by implementing resource factories for respective systems. 

Then you'd need [Java 8+](https://www.java.com/) and [Maven](https://maven.apache.org/index.html) to generate a static HTML site from those files.
Optionally, you can publish your site - there are many options, e.g. [GitHub Pages](https://pages.github.com/).

You wouldn't need a database or a cloud application - you can keep your plans on an encrypted flash drive in a safe in an underground vault, shall they be super-secret.

Because with Nasdanika Engineering all artifacts "live" in one place it makes it an attractive choice for small efforts, or efforts which may have long periods of dormancy - POC's, R&D, ideation, innovation, and conceptualization.
In the case of innovation in an organization, innovators may benefit from shared models, e.g. an organization model with products, services, personas, and goals - in this case an innovation idea can be defined in terms/context of 
these products, services, and goals. E.g. "Build a new service X which would leverage an existing service A and product B to address goal C of the internal persona D". 
This disciplined innovation would help the innovators to align their innovations to organization goals, and the rest of organization to grasp the value of the ideas and prioritize them for implementation.  
 
In a team environment Nasdanika Engineering files can be kept in a source control system such as [Git](https://git-scm.com/). For example, on [GitHub](https://github.com/).
In this case site generation and publishing can be done on code push, e.g. with [CircleCI](https://circleci.com/) or [Jenkins](https://www.jenkins.io/).

In case of using Nasdanika Engineering to engineer a software product, engineering files with the source code. 
In a multi-module, multi-product scenario engineering files for each product/module can be kept with the source code of that product/module and
then be federated into one model to generate a team/organization site. 
[Nasdanika documentation site](https://docs.nasdanika.org/) is generated this way.

Nasdanika Engineering has 46 classes - see below and in the navigation panel on the left, which can be roughly grouped into the following categories:

* Structure - a skeleton to support the work done by the muscles.
* Behavior - muscles which do the work.
* Strategy - brain which directs the work towards goal achievement.
* General purpose - connective tissue assisting the above categories.

It is not necessary to know and use all the classes at once - pick what you need to get started and then expand as needed.

The below sections provide overview of the core concepts, each of the categories, and explain how to get started with Nasdanika Engineering. 
For step-by-step instructions see the [User Guide](https://docs.nasdanika.org/engineering-demo/resources/user-guide/index.html).

### Core concepts

#### Getting started

The easiest way to get started is to download or clone the [Engineering Demo](https://github.com/Nasdanika/engineering-demo) repository.
You may download the latest version or any of [releases](https://github.com/Nasdanika/engineering-demo/releases).

If you clone, you may checkout any of tags as a starting point. 

#### Defining the model

With Nasdanika Engineering you create an engineering model by defining instances of model classes in YAML or other format, e.g. JSON.
YAML is a preferred format because it is more user friendly and also because Nasdanika Engineerings keeps track of line numbers in YAML files, but this functionality is not currently supported for JSON.
As has been mentioned above, a model can be loaded from different types of resources, e.g. some parts of the model can be loaded from YAML while other parts would be loaded from, say, Jira.

When creating YAML specifications use "Load specification" section of respective classes to find supported configuration keys.

Below is a partial sample definition of an [organization](Organization.html):

```yaml
engineering-organization:
   name: Nasdanika Engineering Demo
   path: demo 
   table-of-contents: 
     role: content-left
     header: Contents
```

You can find a full definition [here](https://github.com/Nasdanika/engineering-demo/blob/main/src/test/resources/demo.yml).

Note that the organization definition starts with ``engineering-organization`` where ``engineering`` is a package name and ``organization`` is class name.
For references which are not ``homogenous`` it is required to provide class names. 
Homogenous references have elements of the same type and therefore there is no need to provide class names.
``table-of-contents`` above is an example of a homogenous reference.

A YAML file can reference another YAML file by using a string as reference value, unless that reference is a ``strict-containment``. 
In the latter case the value is treated as a value of the default feature, as in the case of [Transition](Transition.html):

```yaml
  elements:
    - engineering-activity:
        name: A
        path: a
        outputs:
          - b
``` 

``outputs`` is a [journey element](flow/JourneyElement.html) homogenous reference with strict containment and ``target`` is Transition's default feature. 
Therefore, ``b`` is treated as a value of ``target``. 

Default features are shown in bold in load specifications.

The below code snippet demonstrates referencing specification defined in other files/URL's:

```yaml
   resources:
     - resources/user-guide/root.yml
     - resources/base-journey/root.yml
     - resources/extended-journey/root.yml
```

``resources`` reference is not ``strict-containment`` and therefore its value is treated as a URL, which is resolved relatively to the YAML resource URL.
Please note that when referencing external resources ``homogenous`` is ignored, i.e. the resource must contain the type declaration.  

#### Generating a site

You may generate a site by using Maven - ``mvn package`` or ``mvn clean package``. 
If you work on a model in a Java IDE such as [Eclipse](https://www.eclipse.org/ide/) you may run [TestModel.testGenerateDemoSite()](https://github.com/Nasdanika/engineering-demo/blob/main/src/test/java/org/nasdanika/engineering/demo/TestModel.java#L46) from the IDE.

The generation process creates a lot of console output, you may redirect it to a file if desired.

The generation process diagnoses the model and outputs warnings and errors, if there are any, at the end of console output.
Warnings and errors are also displayed on the generated site.
Diagnostic output to the console is very detailed and may be hard to read. 
It is easier to use the generated site to inspect the diagnostic, unless there was ``FAIL`` level diagnostic which caused generation to fail.

Generation may also fail due to incorrect configuration - wrong configuration key or resource URL. Inspect error messages for details.
Below is a sample error message - it tells what is wrong (Unsupported configuration key) and the location of the offending specification (demo.yml line 3 column 4):

```
Tests in error:
  testGenerateDemoSite(org.nasdanika.engineering.demo.TestModel): Unsupported configuration key: path_ at file:/.../engineering-demo/target/test-classes/demo.yml 3:4
```  

### Structure

This section provides an overview of models classes which can be categorized as structural - instances of these classes define a skeleton to
which other instances are "attached".

First of all, [ModelElement](ModelElement.html) and [NamedElement](NamedElement.html) are base classes from which most of the other classes inherit.
Although is some cases not necessary, it is recommended to specify ``path`` attribute for model elements in order to have semantic URI's and URL's.

A number of classes inherit from [Period](Period.html) which supports relative start and end dates - [temporals](Temporal.html), and [duration](Duration.html).
It allows to express plans in relative temporal terms, e.g. "Hire a tester 60 day after the project kick-off" where "Project kick-off" is an [event](Event.html)
which can be initially "unbound", i.e. specified without absolute or relative date. Later on an event can be "bound" to an "instant" - absolute time, or to another 
temporal - an event or start/end of a period, e.g. 30 days before quarter end.

[Engineer](Engineer.html) or [Organization](Organization.html) are typically roots of the model. 
For a single-person efforts with no delegation whatsoever you may define a model with an engineer as its root. 
However, in many cases even for efforts which start as one-man shop eventually comes time when some tasks need to be delegated and execution tracked.
This is when you'd need an organization as it is an engineer which can contain other engineers.
 
Engineers may contain [modules](Module.html) and [products](Product.html) and own [engineered elements](EngineeredElement.html). 
Note that an Engineer is a sub-class of EngineeredElement, i.e. an Engineer can be engineered. For example, a person can be mentored or take courses and an organization 
can improve its processes.

### Behavior

Behavior classes are used to represent things to be done on the structure or external entities to achieve goals.
They are subdivided into two sub-categories:

* **What** - specifies what needs to be done, e.g. "Create a Customer Profile microservice". It may specify how it needs to be done or may reference the existing **How**, e.g. "Create a new microservice" [journey](flow/Journey.html).
* **How** - specifies how a particular task shall be carried out. 

#### What

There are two base classes for the classes in this category:

* [Endeavor](Endeavor.html)
* [EngineeredCapability](EngineeredCapability.html), which extends Endeavor.

In your models you would use subclasses of the above two classes:

* [Issue](Issue.html) and its subclass [Decision](Decision.html). With issue you would use:
    * [Note](Note.html) to track progress
    * [IssueCategory](IssueCategory.html)
    * [IssuePriority](IssuePriority.html)
    * [IssueSeverity](IssueSeverity.html)
    * [IssueStatus](IssueStatus.html)
* [Feature](Feature.html)
* [Release](Release.html)
* [Increment](Increment.html)

#### How

The **How** means what is traditionally User Guides and Cookbooks - step-by-step instructions. 
With Nasdanika Engineering you can create such step-by-step guides as [documents](Document.html) with multiple sections.

However, there is another way and you may choose what is most appropriate in a given situation and even combine the two.

Humans are image processors, not text processors. So if your instructions are not single level linear, i.e. there are
steps and sub-steps and also conditional logic, chances are that if presented visually these instructions would
be easier to follow.

Nasdanika Engineering has a number of classes which can be used to create visual representations of (work)[flows](flow/package-summary.html).
Because they can be used to capture scenarios of how [personas](Persona.html) use products and services provided 
by an engineer or an organization, they are called [journeys](flow/Journey.html).

A journey is a directed graph of [journey elements](flow/JourneyElement.html) - [activities](flow/Activity.html), nested journeys, [services](flow/Service.html),
and [pseudo-states](PseudoState.html).

Journey elements can [transition](flow/Transition.html) control from one another and also [call](flow/Call.html) one another.

Because journey elements inherit from ModelElement, they can have documentation sections to benefit from a combination of 
non-linear and linear knowledge representation.

One important feature of journeys is journey inheritance, which is similar to inheritance in languages like Java - 
it is possible to define a base journey and then extend it and customize (override) journey elements.

Journey inheritance can be useful in hierarchies such as organization hierarchies and technology hierarchies.

In an organization hierarchy higher levels can define generic processes and specify which elements can be customized at lower levels
and which cannot. Lower levels of the organization would customize what they need to their specifics, e.g. local regulations.

Similar to that, in the world of technology one can define, say, a generic journey explaining how to develop and deploy a microservice.
Then that journey can be customized to different ways to deploy, e.g. different cloud providers - private and public, and their offerings.

Document and section inheritance is not currently supported, it will be added in the future releases.

### Strategy

Anything worthwhile takes time and effort to build, ... and there are so many ways to skin a cat.
If you are working on that worthwhile alone you will need a way to ensure that you are staying focused on achieving your goals.
If you are working with others, you'll need a way to provide to your team means for efficient decision making to avoid prolonged debates.

With Nasdanika Engineering you do it with subclasses of [Aim](Aim.html) to which [alignables](Alignable.html) such as [endeavors](Endeavor.html) 
and other aims can be [aligned](Alignment.html) to.

For example, issues can be aligned to, say, [persona](Persona.html) [goals](Goal.html) to ensure that your org is doing the right thing,
and to [principles](Principle.html) to ensure that you are doing it right. 

An issue "Build Customer Profile microservice" can be aligned to a customer persona goal "Manage my information" and [The Twelve Factor App](https://12factor.net/) principles.

Nasdanika Engineering also supports the [OKR](https://en.wikipedia.org/wiki/OKR) goal setting framework via [Objective](Objective.html) and [KeyResult](KeyResult.html) classes.
It is possible to define issues as initiatives under key results. This provides an alternative way to organize efforts - 
instead of defining issues under products and modules and then aligning them to aims.
You may pick a method which works best for your situation or use a combination of these two approaches.

In the case of defining issues as initiatives you may have something like this:

* Organization
    * Mission - top level goal.
        * Organization goals - multiple.
    * Increments - quarters, years.
        * Organization objectives aligned to goals
            * Key results
    * Engineers and sub-organizations
        * Objectives for increments linked to organization key results
            * Key results
                * Initiatives with sub-issues hierarchy.             

### General purpose

[Appearance](Appearance.html) and its subclasses can be used to declaratively customize the generated UI.
Customization can be done at the class level, i.e. customizations would apply to all, say, issues, or at an individual model element level.

[Directory](Directory.html) is a way to group resources such as [documents](Document.html), [links](Link.html), [named element references](NamedElementReference.html), 
and any [named elements](NamedElement.html) in general.

Model elements and documents which use sections can use [tables of contents](TableOfContents.html). 

Engineered elements can have [discussion topics](Topic.html) with [messages](Message.html) and nested [forums](Forum.html).
For example, there might be a discussion forum for a document section or for a journey activity.
This allows to have highly focused micro-communities of practice where engineered element owners and experts help others. 




* For software development efforts models "live" with the code and follow its lifecycle - branching, commits, merges. As some of engineering model elements are executable, e.g. already mentioned Vinci actions, the models are code by definition as they contain instructions to be executed by a computer. 
* Unlike text files or spreadsheets which can also "live" with the code, models provide more structure and functionality for the engineering domain.

"As-code" approach may be attractive in the following situations:

* Sensitive data - with as-code approach such data may be kept in a highly secure fashion and never cross the network.
* Reduced infrastructure requirements - there is no need for an issue tracking server. 

