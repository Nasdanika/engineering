Engineered element is something that is "brought about" by [engineers](Engineer.html) working on [issues](Issue.html) associated with the engineered element.

For example:

* One engineer may be trained by another engineer, 
* [Persona](Persona.html) definition and [goals](Goal.html) my be elicited by interviewing persona representatives.
* Software [Module](Module.html) source code can be modified to add new functionality.
* [Document](Document.html) can be updated by adding new sections or elaborating existing content.
* [Directory](Directory.html) can be populated with resources.
* [Organization](Organization.html) can improve its efficiency by formally defining its services as [activities](flow/Activity.html) and [journeys](flow/Journey.html).

Engineered element may have owning engineers, who have authority over the element, and expert engineers, who know how to use the element, but do not have authority.
E.g. a software library can be owned by a team of engineers and have experts who use the library in their solutions.

Engineered element can define [principles](Principle.html) to support decision making and [align](Alignment.html) [engineered capabilities](EngineeredCapability.html), e.g. issues.
Published formally documented principles are important for Open and Inner Source projects to ensure contribution process efficiency.

Engineers may be [allocated](Allocation.html) some capacity to work on the engineered element's issues for a particular [endeavor](Endeavor.html) and [issue category](IssueCategory.html).

Engineered element is a a subclass of [Period](Period.html) and can have start, duration, and end.
Semantics of those features depend on a subclass of engineered element. 
For example:

* [JourneyElement](flow/JourneyElement.html) - duration specifies how long it takes to complete an activity. E.g. ``P1D`` - one day, or ``PT2H15M`` - two hours and 15 minutes.
* [Document](Document.html), [Module](Module.html) and [Product](Product.html) - inception and retirement.
* [Persona](Persona.html) - when support of a given persona shall start and end.
* [Engineer](Engineer.html) - when an engineer starts and ends their engagement.
* [Organization](Organization.html) - organization formation and disbandment. 