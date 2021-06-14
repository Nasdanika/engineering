Feature appearance defines how a structural feature is shown in the UI.

```yml
model-elements:
  model-element:
    features:
      resources:
        icon: fas fa-book
        roles: 
         - feature-actions/section
         - element-actions/none  
```

The above example specifies that ``resources`` feature of [ModelElement](ModelElement.html) shall be displayed with a book icon and shall be rendered as a [feature actions section](https://github.com/Nasdanika/engineering/blob/main/gen/src/org/nasdanika/engineering/gen/ModelElementViewActionImpl.java#L768). 

It also specifies that elements of this feature shall have role ``none``. I.e. they HTML pages shall be generated for these elements, but they should not be automatically referenced from the UI -
this referencing is explicitly done from the feature action by generating a [resources table](https://github.com/Nasdanika/engineering/blob/main/gen/src/org/nasdanika/engineering/gen/ModelElementViewActionImpl.java#L755). 