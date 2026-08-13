# Diffs against upstream Dracula Theme

This document tracks all specific theme keys and editor scheme options where **Dracula Void** intentional overrides differ from upstream **Dracula Colorful** / **Dracula Theme**, organized by component alongside visual comparison screenshots.

## Theme JSON Key Overrides (`*.theme.json`)

### Core Color Palette
| Key | Upstream Value | Dracula Void Value | Description |
|---|---|---|---|
| `colors.primaryBackground` | `#282a36` | `#000000` | Pure black background for main windows and containers |
| `colors.secondaryBackground` | `#3a3d4c` | `#000000` | Pure black background for secondary panels |
| `colors.editorBackground` | `#282a36` | `#000000` | Pure black background for editor canvas |

### General UI & Window Surfaces
| Component Key | Upstream Value | Dracula Void Value |
|---|---|---|
| `ui.EditorTabs.underlinedTabBackground` | `#292b38` | `selectionInactiveBackground` |
| `ui.Table.lightSelectionBackground` | `secondaryBackground` | `selectionBackground` |
| `ui.ToolWindow.background` | `secondaryBackground` | `primaryBackground` |
| `ui.ToolWindow.Button.selectedBackground` | `selectionBackground` | `secondaryAccentColor` |
| `ui.Tree.background` | `secondaryBackground` | `primaryBackground` |
| `ui.WelcomeScreen.Details.background` | `hoverBackground` | `secondaryBackground` |

---

## XML Editor Scheme Overrides (`DraculaVoid.xml`)

| Scheme Option Key | Upstream Value | Dracula Void Value | Description |
|---|---|---|---|
| `CONSOLE_BACKGROUND_KEY` | `"282a36"` | `""` (transparent) | Inherits pure black editor/terminal background |
| `DEFAULT_IDENTIFIER` foreground | `#b9bcd1` | `#f8f8f2` | Brightened identifier text |
| `DEFAULT_INSTANCE_FIELD` foreground | `#ffb86c` | `#f8f8f2` | Cleaned field foreground contrast |
| `DEFAULT_LOCAL_VARIABLE` foreground | `#b9bcd1` | `#f8f8f2` | Brightened local variable text |
| `DEFAULT_PARAMETER` foreground | `#b9bcd1` | `#ffb86c` | Orange parameter text |
| `TEXT` background | `#282a36` | `#000000` | Pure black editor text background |

---

## Visual Components & Key Breakdown

### Notification

**Involved Keys:**

| Key | Upstream Value | Dracula Void Value |
|---|---|---|
| `ui.Notification.errorBackground` | `primaryBackground` | `primaryBackground` (`#000000`) |
| `ui.Notification.errorBorderColor` | `#ff5554` | `#ff5554` |
| `ui.Notification.ToolWindow.errorBackground` | `primaryBackground` | `primaryBackground` (`#000000`) |

| Before                                         | After                                        |
|------------------------------------------------|----------------------------------------------|
| ![before](./resources/notification-before.png) | ![after](./resources/notification-after.png) |

---

### Checkbox

**Involved Keys:**

| Key | Upstream Value | Dracula Void Value |
|---|---|---|
| `icons.ColorPalette.Checkbox.Foreground.Selected.Dark` | `#f8f8f2` | `#bd93f9` |
| `icons.ColorPalette.Checkbox.Border.Disabled.Dark` | `#6272a4` | `#424860` |
| `icons.ColorPalette.Checkbox.Background.Default.Dark` | `#6272a4` | `#424860` |

| Before                                     | After                                    |
|--------------------------------------------|------------------------------------------|
| ![before](./resources/checkbox-before.png) | ![after](./resources/checkbox-after.png) |

---

### Action Button

**Involved Keys:**

| Key | Upstream Value | Dracula Void Value |
|---|---|---|
| `ui.ActionButton.pressedBackground` | `secondaryBackground` | `selectionInactiveBackground` |
| `ui.ActionButton.pressedBorderColor` | `secondaryBackground` | `secondaryAccentColor` |

| Before                                          | After                                         |
|-------------------------------------------------|-----------------------------------------------|
| ![before](./resources/action-button-before.png) | ![after](./resources/action-button-after.png) |

---

### Button

**Involved Keys:**

| Key | Upstream Value | Dracula Void Value |
|---|---|---|
| `ui.Button.startBackground` | `#565b75` | `primaryBackground` |
| `ui.Button.endBackground` | `#565b75` | `primaryBackground` |
| `ui.Button.disabledBorderColor` | `#565b75` | `separatorColor` |

| Before                                          | After                                         |
|-------------------------------------------------|-----------------------------------------------|
| ![before](./resources/button-before.png) | ![after](./resources/button-after.png) |

---

### Plugins

**Involved Keys:**

| Key | Upstream Value | Dracula Void Value |
|---|---|---|
| `ui.Plugins.lightSelectionBackground` | `secondaryBackground` | `selectionBackground` |
| `ui.Plugins.Button.updateBorderColor` | `#5da3f4` | `accentColor` |
| `ui.Plugins.Button.updateForeground` | `primaryBackground` | `primaryForeground` |
| `ui.Plugins.Button.updateBackground` | `#5da3f4` | `accentColor` |

| Before                                    | After                                   |
|-------------------------------------------|-----------------------------------------|
| ![before](./resources/plugins-before.png) | ![after](./resources/plugins-after.png) |
