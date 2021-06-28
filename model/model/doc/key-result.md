Key Results are specific measures used to track achievement of their containing [objective](Objective.html). 
Key Results measure progress towards the Objective — like a milepost on a highway that shows how close an [engineer](Engineer.html) or [organization](Organization.html) are to the key result's objective.

Key Result has ``weight`` attribute which indicates how much completion of this key result contributes to the completion of it objective.

Key Results may contain [issues](Issue.html) as ``initiatives`` - what needs to be done to achieve the Key Result. 
Initiatives can be used to track efforts which do not explicitly belong to a specific [engineered element](EngineeredElement.html), or which are specific to this Key Result.
Otherwise, issues or other [engineered capabilities](EngineeredCapability.html) shall be defined under their respective engineered elements and be [aligned](Alignment.html) to the Key Result.

For example, an issue of implementing a piece of new functionality in a product shall be created under that product.
An issue to prepare to present the organization and its offerings (products and services) on a conference which targets multiple personas/demographics would logically 
reside under a key result "Present on X conferences".
