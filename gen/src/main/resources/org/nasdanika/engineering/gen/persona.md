[Personas](${doc-uri}Persona.html) represent represent the different types of consumers of [products](${doc-uri}Product.html) and [services](${doc-uri}Engineer.htlm#EReference-services).

Personas may have [goals](${doc-uri}Goal.html) and form an inheritance hierarchy using ``extends`` reference.
Personas also may define [activities](${doc-uri}Activity.html) or [journeys](${doc-uri}Journey.html) describing how they interact with services and product [features](${doc-uri}Feature.html).

Personas may also have [engineers](${doc-uri}Engineer.html) serving as persona representatives and helping the persona owner to refine the persona definition.

For example, in a large organization some department may be serving internal customers by providing services or products. 
Say, a tooling team provides a code generator for developers. 
In this case the tooling team would create a "Developer" persona and work with several developers as that persona representatives
to refine the persona definitions and persona goals and then identify code generator features to be implemented to achieve the persona's goals.

Engineer and as such [Organization](${doc-uri}Organization.html) are sub-classes of Persona and therefore may also define goals.
