Event is an [engineered](EngineeredElement.html) [temporal](Temporal.html).
It has a name, may have owners and issues.

Usage scenario:

* Define an empty event, e.g. "Project start" or "Second round of funding" or "Product X version Z release". 
* Define an owner of the event, e.g. a person who is a contact with the vendor of Product X and can provide updates on version Z release.
* Set upper and lower bounds if known.
* Optionally add issues, e.g. communications about the upcoming event.
* Define other temporals, e.g. phase starts relative to the event. Generated Web UI will show start/end relative to the event date.
* Once the event absolute or relative date in known, enter it to the model. Generated Web UI will show absolute dates or dates relative to the event root base. 