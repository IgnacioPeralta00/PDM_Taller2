# Implement DishCard Component

Create the `DishCard` component for the restaurant detail screen based on the provided reference image.

## User Review Required

- **Design Fidelity**: The card will feature a horizontal layout with an image on the left, title and description in the center/top, and an "Agregar" button at the bottom right of the text area.
- **Interactivity**: The "+ Agregar" button will be a `Button` with a filled background, matching the visual style.

## Proposed Changes

### Detail Screen

#### [Detail.kt](file:///C:/Users/Peral/Documents/PDM2026/Talleres/PDM_Taller2/app/src/main/java/com/pdm/fipr/foodspot/screens/detail/Detail.kt)

- Implement the `DishCard` composable:
    - Use `OutlinedCard` for the thin border look shown in the image.
    - `Row` layout for image and text content.
    - `AsyncImage` for the dish photo (80dp-100dp square).
    - `Column` for the Title, Description, and the "Agregar" button.
- Integrate `DishCard` into the `RestaurantsDetailScreen`'s `LazyColumn`.

## Verification Plan

### Manual Verification
- Verify the layout of `DishCard` matches the provided image using a Compose Preview.
- Ensure the detail screen correctly displays the list of dishes.
