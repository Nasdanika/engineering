[Decision](${doc-uri}Decision.html) is an [issue](${doc-uri}Issue.html), which is also an [aim](${doc-uri}Aim.html), i.e. [endeavors](${doc-uri}Endeavor.html), 
such as issues, and other aims such as other decisions may be [aligned](${doc-uri}Alignable.html) to it.

Decision chaining can be done via alignment or via ``requires`` dependency. 
Alignment indicates that the "premise" decision affects the aligned decision, but the aligned decision can be in effect if the premise decision is not in effect.
Requirement dependency indicates that the requiring decision can be in effect only when the required decision is in effect.

Decisions can have effective dates and can be superceded by other decisions. 

This class does not specify the decision making process. 
Future releases or extensions may provide decision subclasses which support different [decision analysis](https://en.wikipedia.org/wiki/Decision_analysis) methodologies, 
e.g. [Multiple-criteria decision analysis](https://en.wikipedia.org/wiki/Multiple-criteria_decision_analysis) methodologies such as [Analytic Hierarchy Process](https://en.wikipedia.org/wiki/Analytic_hierarchy_process)
or [Weighted Sum Model](https://en.wikipedia.org/wiki/Weighted_sum_model).