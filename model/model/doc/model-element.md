Model element is the root class for all other model classes. 

It has ``path`` attribute which is used to compute model element's ``uri`` and also model element's URL in the UI.

It also has ``documentation`` containment reference.
One way to document model elements is to use [Markdown](${classifier/Markdown@urn:org.nasdanika.exec.content}) as shown in in below example:

```yaml
engineering-module:
  name: EMF
  path: emf
  documentation:
    content-markdown:
      style: true
      source:
        content-resource: readme.md
```

You can also use [Interpolator](${classifier/Interpolator@urn:org.nasdanika.exec.content}) to interpolate tokens and to process includes.
E.g.

```yaml
engineering-module:
  name: EMF
  path: emf
  action-prototype: "../javadoc-action-prototype.xml#/"
  documentation:
    content-interpolator:
      source:
        content-markdown:
          style: true
          source:
            content-resource: readme.md
``` 
