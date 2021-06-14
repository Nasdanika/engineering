Appearance allows to customize HTML UI generation process.
Appearance can be defined at a class level and individual element level.

See:

* [default-apperance.yml](https://github.com/Nasdanika/engineering/blob/main/gen/src/org/nasdanika/engineering/gen/default-appearance.yml) for a reference - you may copy appropriate parts and then customize.
* [demo.yml](https://github.com/Nasdanika/engineering-demo/blob/main/src/test/resources/demo.yml#L4) for an example of defining appearance at a model element.

### Nasdanika HTML Application Concepts

This section provides an overview of Nasdanika HTML Application structure so you better understand how appearance works.
When HTML is generated from engineering model elements these elements are first converted to a hierarchy of actions and then these actions are used to generate HTML.
Appearance allows to customize the actions.

Nasdanika HTML application consists of multiple parts as shown on the illustration below. 

![application-parts](/engineering/images/application-parts.png)

All parts are optional.

The action-centric approach allows developers to focus on the functionality of their application in terms of actions and select action roles and application themes later. 
Also, changing of the action role does not change the application functionality, just the appearance.
It allows to adjust the application as it evolves. For example, an action of a documentation site might be in a section role if it doesn't have a lot of content and then change its role to navigation.

#### Action UI life cycle

In the UI an action goes through the following stages:

* Display - an action link is displayed to the user. The link may have an icon, text or both. It may also have a tooltip. Inline actions don't go through this stage - they go directly to the last stage. 
Some actions are always visible to the user, e.g. the root and principal actions (see below). Some are only shown in a context of another active action, e.g. context and section actions.
* Activation - user clicks on the action link. Actions may have URL, script, and binding activators. URL activator navigates to a URL, script activator executes a script, and a binding activator executes a script on page load allowing to perform custom action binding, e.g. set [Knockout](https://knockoutjs.com/) binding attributes.
* Display of action content. At this stage action content is displayed to the user. For inline actions content is displayed where the link is displayed for non-inline actions. For other actions content is displayed in the content panel. 

#### Action types

An application page is generated from 3 actions:

* Root action - the root of the action hierarchy. It is displayed in the header with its navigation children (see action roles), except the first one, displayed in the root navigation bar on the top right.
On this page "Nasdanika" is the root action.
Context children of the root action are displayed in the footer.
* Principal action - by default the first navigation child of the root action. Displayed in the [navigation bar brand](https://getbootstrap.com/docs/4.5/components/navbar/#brand) on the left. On this page "Engineering" is the principal action.
Context children of the principal action are displayed in the navigation bar on the right of the principal action.
Navigation children of the principal action are displayed recursively in the navigation panel. On this page it is a list of documentation actions.
* Active action - any action in the hierarchy which is currently "active", i.e. its content is displayed in the content panel and it is shown as active/selected in the navigation panel or navigation bar. On this page ``Appearance`` is the active action - it is selected in the navigation tree and your are reading its content. Active action path is displayed in the [breadcrumb](https://getbootstrap.com/docs/4.5/components/breadcrumb/).
    * Context children of the active action are displayed in in the active action navigation bar to the right of the action title.
    * Section children are displayed as page sections with their context children displayed in section navigation bars to the right of section titles (for paragraph [section style](SectionStyle.html)).
    * Content left children are displayed in the left content navigation panel.
    * Content right children are displayed in the right content navigation panel.   

#### Action roles

Action can be in zero or more roles. Action roles define where the action and its content (for sections) is displayed. 
This section explains action roles. It also provides a role-centric explanation of where actions are displayed depending on their role and parent action type.

##### Navigation		

* For the root action the first navigation child is the principal. Subsequent navigation children, if any, are displayed in the root navigation bar on the top right.
* Navigation children of the principal action and their navigation children recursively are displayed in the navigation panel.
		
##### Context		

* Context children of the root action are displayed in the footer.
* Context children of the principal action are displayed in the navigation bar.
* Active action context children are displayed in the active action navigation bar to the right of the action title.
* Section action context children are displayed in the section navigation bar to the right of the section title.
		
##### Section		

Section children of the active action are shown as sections in the content panel of their non-section ancestor.
Sections can be nested.
There are different ways to display sections:

* Action group.
* Card
* Card pill
* Card tab
* Paragraph
* Pill
* Table
		
##### Content left		

Content left children of the active action are shown in a navigation panel to the left of the action content.

##### Content right		

Content right children of the active action are shown in a navigation panel to the right of the action content.

#### Application parts

This section describes application parts and provides parts-centric view on where actions are displayed in addition to type and role centric views provided in the previous sections.

##### Header

Displays the root action on the left. 

###### Root navigation

Displays second+ navigation children of the root, if any, on the right.

##### Navigation bar

Displays the principal action in the brand and its context children, if any, on the right of the brand.

##### Navigation panel

Recursively displays navigation children of the principal action. The navigation panel (and content left/right navigation panel) are adaptive - they change their appearance depending on the action hierarchy depth and categorization:

* If there are no categories and tree depth is 1 then actions are displayed as a list.
* If navigation action tree depth is more than one then actions are displayed in a tree.
* If root actions of the panel are categorized then they are displayed in category cards as a list or tree depending on the tree depth.

##### Content panel

Displays breadcrumb with active action path, active action title, content and content of its section children. 
If active action is a section then its first non-section ancestor is used as an "effective" active action. 

###### Active action navigation bar

Displays context children of the active action.

###### Sections

Section children of the active action. 

###### Content left navigation panel 

Adaptive navigation panel displaying ``content left`` children of the active action. Section content left and right panels are supported for the paragraph [section style](SectionStyle.html). 
Support for other section styles will be added in the future releases.

###### Content right navigation panel

Adaptive navigation panel displaying ``content right`` children of the active action.

##### Footer

Displays context children of the root action.
 