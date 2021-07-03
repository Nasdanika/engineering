[Engineers](${doc-uri}Engineer.html) are entities, people or [organizations](${doc-uri}Organization.html), owning [engineered elements](${doc-uri}EngineeredElement.html)
and working on [endeavors](${doc-uri}Endeavor.html), e.g. [issues](${doc-uri}Issue.html).

Engineer extends [Persona](${doc-uri}Persona.html) and as such can have [goals](${doc-uri}Goal.html).
Because Persona extends [Engineered Element](${doc-uri}EngineeredElement.html) it may have issues associated with it.

When applied to an Engineers it may be development issues, e.g. training. Say, Joe Doe may have an issue "Team lead training" assigned to Jim Smith, his supervisor.
What it means that Jim trains Joe and it is tracked in the same way as tracking of [product](Product.html) development, i.e. you can develop (engineer) your organization in the
same way you develop (engineer) products and services offered by your organization.

Engineers may have [capacity](${doc-uri}Capacity.html) to work on endeavors and that capacity can be [allocated](${doc-uri}Allocation.html) to [engineered elements](${doc-uri}EngineeredElement.html) and [issue categories](${doc-uri}IssueCategory.html).

In addition to owning engineered elements, engineers may have expertise in them. Ownership primarily means authority to make decisions about the owned elements. 
Expertise means knowledge of how to use them. Usually ownership assumes expertise, although the owner may consult the experts and then make decisions base on their inputs.
Owners and experts form a community for an engineered element.

Engineer may define [increments](${doc-uri}Increment.html), [issue categories](${doc-uri}IssueCategory.html), and [issue statuses](${doc-uri}IssueStatus.html).
Typically it would be done at the top-level organization.   

Engineer may define personas and represent them. E.g. in an organization there might be a "Developer" persona defined at the "Developer Experience" organization
and represented by developers. This allows to define personal goals by interviewing the representatives and then align organizaiton's endeavors to the persona goals.

Engineers may also have [objectives](${doc-uri}Objective.html) associated with endeavors, e.g. [increments](${doc-uri}Increment.html). 
E.g. "Developer" persona may have a goal "Automate routine tasks" and there might be an annual objective "Create code generators" aligned to that goal.
Then, subsequently, a [feature](${doc-uri}Feature.html) "Cloud microservice code generator" can be aligned to the "Create code generators" objective or its [key result](${doc-uri}KeyResult.html), say "5 code generators for the cloud".

Engineers may contain [modules](${doc-uri}Module.html). E.g. a team may contain libraries developed by the team and then ownership of these libraries may be assigned to team members.

Engineers may also provide services - shared [activities](${doc-uri}Activity.html) used by other engineers or personas. For example, a performance testing team may provide a testing service used by
development teams to performance test modules they own. 

Services may be defined as [journeys](${doc-uri}Journey.html) leveraging services provided by other engineers. 
For example, the performance team's service "Performance test an application" may use a service "Provision cloud environment" provided by the cloud infrastructure team.

And, finally, engineers may post [messages](${doc-uri}Message.html) to [topics](${doc-uri}Topic.html) of [discussion forums](${doc-uri}Forum.html).
