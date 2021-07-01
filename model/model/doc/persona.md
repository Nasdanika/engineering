Personas represent represent the different types of consumers of [products](Product.html) and [services](Engineer.htlm#EReference-services).

Personas may have [goals](Goal.html) and form an inheritance hierarchy using ``extends`` reference.
Personas also may define [activities](flow/Activity.html) or [journeys](flow/Journey.html) describing how they interact with services and product [features](Feature.html).

Personas may also have [engineers](Engineer.html) serving as persona representatives and helping the persona owner to refine the persona definition.

For example, in a large organization some department may be serving internal customers by providing services or products. 
Say, a tooling team provides a code generator for developers. 
In this case the tooling team would create a "Developer" persona and work with several developers as that persona representatives
to refine the persona definitions and persona goals and then identify code generator features to be implemented to achieve the persona's goals.

Engineer and as such [Organization](Organization.html) are sub-classes of Persona and therefore may also define goals.
