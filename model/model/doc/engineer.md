Engineers are entities, people or organizations, owning [engineered elements](EngineeredElement.html) and working on [endeavors](Endeavors.html), e.g. [issues](Issue.html).

Engineer extends [Persona](Persona.html) and as such can have [goals](Goal.html).
Because Persona extends [Engineered Element](EngineeredElement.html) it may have issues associated with it.

When applied to an Engineers it may be development issues, e.g. training. Say, Joe Doe may have an issue "Team lead training" assigned to Jim Smith, his supervisor.
What it means that Jim trains Joe and it is tracked in the same way as tracking of [product](Product.html) development, i.e. you can develop (engineer) your organization in the
same way you develop (engineer) products and services offered by your organization.

Engineers may have [capacity](Capacity.html) to work on endeavors and that capacity can be [allocated](Allocation.html) to [engineered elements](EngineeredElement.html) and [issue categories](IssueCategory.html).

In addition to owning engineered elements, engineers may have expertise in them. Ownership primarily means authority to make decisions about the owned elements. 
Expertise means knowledge of how to use them. Usually ownership assumes expertise, although the owner may consult the experts and then make decisions base on their inputs.
Owners and experts form a community for an engineered element.

Engineer may define [increments](Increment.html), [issue categories](IssueCategory.html), and [issue statuses](IssueStatus.html).
Typically it would be done at the top-level [organization](Organization.html).   

Engineer may define [personas](Persona.html) and represent them. E.g. in an organization there might be a "Developer" persona defined at the "Developer Experience" organization
and represented by developers. This allows to define personal goals by interviewing the representatives and then align organizaiton's endeavors to the persona goals.

Engineers may also have [objectives](Objective.html) associated with endeavors, e.g. increments. 
E.g. "Developer" persona may have a goal "Automate routine tasks" and there might be an annual objective "Create code generators" aligned to that goal.
Then, subsequently, a [feature](Feature.html) "Cloud microservice code generator" can be aligned to the "Create code generators" objective or it's [key result](KeyResult.html), say "5 code generators for the cloud".

Engineers may contain [modules](Module.html). E.g. a team may contain libraries developed by the team and then ownership of these libraries may be assigned to team members.

Engineers may also provide services - shared [activities](Activity.html) used by other engineers or personas. For example, a performance testing team may provide a testing service used by
development teams to performance test modules they own. 

Services may be defined as [journeys](Journey.html) leveraging services provided by other engineers. 
For example, the performance team's service "Performance test an application" may use a service "Provision cloud environment" provided by the cloud infrastructure team.

And, finally, engineers may post [messages](Message.html) to [topics](Topic.html) of [discussion forums](Forum.html).
