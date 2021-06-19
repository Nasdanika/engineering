Model element [appearance](Appearance.html) defines how a model element is shown in the UI. It may contain a map of feature names in kebab case to [feature appearance](FeatureAppearance.html).

```yml
model-elements:
  module:
    icon: fas fa-cube
    features:
      modules:
        icon: fas fa-cubes
```

The above example specifies that [Module](Module.html) and its sub-classes, unless specified otherwise at the sub-class level, have a [cube](https://fontawesome.com/v5.15/icons/cube?style=solid) icon
and its feature ``module`` have [cubes](https://fontawesome.com/v5.15/icons/cubes?style=solid) icon.