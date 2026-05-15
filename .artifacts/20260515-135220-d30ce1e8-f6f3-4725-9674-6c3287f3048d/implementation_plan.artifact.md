# Update Restaurant Data

Update the dummy data in `Restaurants.kt` to include 10 restaurants, ensuring categories are defined as strings within each restaurant and images use public URLs.

## User Review Required

- **Category Definition**: Categories will be written as literal Strings in each `Restaurant` object instead of referencing an external map.

## Proposed Changes

### Data Layer

#### [Restaurants.kt](file:///C:/Users/Peral/Documents/PDM2026/Talleres/PDM_Taller2/app/src/main/java/com/pdm/fipr/foodspot/dummy/Restaurants.kt)

- I will populate `dummyRestaurants` with 10 restaurant instances.
- Each restaurant will have at least 4 different categories distributed across the list.
- Each restaurant will contain at least 3 dishes.
- All images will use public Unsplash URLs.

## Verification Plan

### Manual Verification
- Verify that the code compiles and the `dummyRestaurants` list contains exactly 10 items.
- Check that categories are distributed and dishes meet the minimum requirement.
