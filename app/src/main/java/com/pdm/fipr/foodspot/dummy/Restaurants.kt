package com.pdm.fipr.foodspot.dummy

import com.pdm.fipr.foodspot.model.Dish
import com.pdm.fipr.foodspot.model.Restaurant

val dummyRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizzeria Italia",
        description = "Auténtica pizza napolitana preparada en horno de leña con ingredientes importados.",
        imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591",
        categories = listOf("Pizzas", "Pastas", "Italiana", "Gourmet"),
        menu = listOf(
            Dish(1, "Margherita", "Tomate San Marzano, mozzarella de búfala y albahaca fresca.", "https://images.unsplash.com/photo-1574071318508-1cdbad80ad38"),
            Dish(2, "Pepperoni", "Mozzarella y abundante pepperoni crujiente.", "https://images.unsplash.com/photo-1628840042765-356cda07504e"),
            Dish(3, "Calzone Tradicional", "Pizza cerrada rellena de ricotta, jamón y queso.", "https://images.unsplash.com/photo-1627308595229-7830a5c91f9f")
        )
    ),
    Restaurant(
        id = 2,
        name = "Burger King",
        description = "Disfruta del auténtico sabor a la parrilla en cada hamburguesa.",
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd",
        categories = listOf("Hamburguesas", "Comida rápida", "Bebidas", "Americana"),
        menu = listOf(
            Dish(4, "Whopper", "La clásica hamburguesa con carne 100% a la parrilla.", "https://images.unsplash.com/photo-1568901346375-23c9450c58cd"),
            Dish(5, "Papas Fritas XL", "Porción grande de papas doradas y crujientes.", "https://images.unsplash.com/photo-1573082852244-215e8f2a5c36"),
            Dish(6, "Aros de Cebolla", "Crujientes aros de cebolla empanizados.", "https://images.unsplash.com/photo-1639024471283-03518883512d")
        )
    ),
    Restaurant(
        id = 3,
        name = "Sushi Master",
        description = "Fusión de sabores orientales con los mejores ingredientes del mar.",
        imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c",
        categories = listOf("Asiática", "Mariscos", "Gourmet", "Saludable"),
        menu = listOf(
            Dish(7, "California Roll", "Cangrejo, aguacate, pepino y sésamo.", "https://images.unsplash.com/photo-1579584425555-c3ce17fd4351"),
            Dish(8, "Dragon Roll", "Anguila, tempura de langostino y cobertura de aguacate.", "https://images.unsplash.com/photo-1553621042-f6e147245754"),
            Dish(9, "Nigiri Salmón", "Láminas de salmón fresco sobre arroz avinagrado.", "https://images.unsplash.com/photo-1583623025817-d180a2221d0a")
        )
    ),
    Restaurant(
        id = 4,
        name = "Tacos El Guero",
        description = "Sabor tradicional mexicano en cada mordida. ¡Los mejores tacos de la zona!",
        imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47",
        categories = listOf("Mexicana", "Comida rápida", "Bebidas", "Familiar"),
        menu = listOf(
            Dish(10, "Tacos al Pastor", "Cerdo marinado con piña, cilantro y cebolla.", "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b"),
            Dish(11, "Gringa de Pastor", "Tortilla de harina con queso fundido y carne al pastor.", "https://images.unsplash.com/photo-1599974590225-217ec63a453b"),
            Dish(12, "Quesadilla Especial", "Tortilla de maíz con queso y champiñones.", "https://images.unsplash.com/photo-1593560708920-61dd98c46a4e")
        )
    ),
    Restaurant(
        id = 5,
        name = "Fresh Garden",
        description = "Opciones saludables y deliciosas para cuidar tu cuerpo.",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd",
        categories = listOf("Ensaladas", "Saludable", "Gourmet", "Bebidas"),
        menu = listOf(
            Dish(13, "Ensalada César", "Lechuga romana, pollo a la parrilla, croutones y aderezo césar.", "https://images.unsplash.com/photo-1550304943-4f24f54ddde9"),
            Dish(14, "Quinoa Bowl", "Mezcla de quinoa con vegetales asados y aguacate.", "https://images.unsplash.com/photo-1546069901-ba9599a7e63c"),
            Dish(15, "Smoothie Detox", "Zumo de espinaca, manzana verde y jengibre.", "https://images.unsplash.com/photo-1610970881699-44a5587cabec")
        )
    ),
    Restaurant(
        id = 6,
        name = "Pasta & Co.",
        description = "Variedad de pastas frescas con salsas tradicionales italianas.",
        imageUrl = "https://images.unsplash.com/photo-1473093226795-af9932fe5856",
        categories = listOf("Pastas", "Italiana", "Vinos", "Gourmet"),
        menu = listOf(
            Dish(16, "Spaghetti Carbonara", "Pasta con huevo, queso pecorino y guanciale.", "https://images.unsplash.com/photo-1612459284970-e8f027596582"),
            Dish(17, "Lasagna Boloñesa", "Capas de pasta rellenas de carne y salsa bechamel.", "https://images.unsplash.com/photo-1502413174030-4138a0678d49"),
            Dish(18, "Fettuccine Alfredo", "Pasta con salsa cremosa de mantequilla y parmesano.", "https://images.unsplash.com/photo-1645112481338-3561ec9084aa")
        )
    ),
    Restaurant(
        id = 7,
        name = "Oriental Wok",
        description = "Platos salteados al momento con el mejor sabor asiático.",
        imageUrl = "https://images.unsplash.com/photo-1512058560366-cd242958773c",
        categories = listOf("Asiática", "Comida rápida", "Bebidas", "Salteados"),
        menu = listOf(
            Dish(19, "Pad Thai", "Fideos de arroz con camarones, huevo y maní.", "https://images.unsplash.com/photo-1559339352-11d035aa65de"),
            Dish(20, "Pollo Kung Pao", "Pollo con chiles, cacahuates y verduras.", "https://images.unsplash.com/photo-1525755662778-989d0524087e"),
            Dish(21, "Rollitos de Primavera", "Rollitos crujientes rellenos de vegetales.", "https://images.unsplash.com/photo-1544025162-d76694265947")
        )
    ),
    Restaurant(
        id = 8,
        name = "Mariscos El Faro",
        description = "Pescados y mariscos frescos traídos directamente del puerto.",
        imageUrl = "https://images.unsplash.com/photo-1551489186-cf8726f514f8",
        categories = listOf("Mariscos", "Bebidas", "Gourmet", "Familiar"),
        menu = listOf(
            Dish(22, "Ceviche Peruano", "Pescado marinado en limón con cebolla y ají.", "https://images.unsplash.com/photo-1534080564607-317f53f89981"),
            Dish(23, "Arroz con Camarones", "Arroz sazonado con abundantes camarones frescos.", "https://images.unsplash.com/photo-1599321955419-780136f46276"),
            Dish(24, "Tiradito de Pescado", "Finas láminas de pescado en salsa cítrica.", "https://images.unsplash.com/photo-1626202133282-f8502c708521")
        )
    ),
    Restaurant(
        id = 9,
        name = "Sweet Moments",
        description = "Endulza tu día con nuestros postres artesanales.",
        imageUrl = "https://images.unsplash.com/photo-1509042239860-f550ce710b93",
        categories = listOf("Postres", "Bebidas", "Dulces", "Merienda"),
        menu = listOf(
            Dish(25, "Cheesecake de Arándanos", "Base de galleta crujiente con crema de queso y arándanos.", "https://images.unsplash.com/photo-1533134242443-d4fd215305ad"),
            Dish(26, "Tiramisú", "Postre italiano con café, mascarpone y cacao.", "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9"),
            Dish(27, "Frappé de Caramelo", "Café helado con salsa de caramelo y nata.", "https://images.unsplash.com/photo-1534778101976-62847782c213")
        )
    ),
    Restaurant(
        id = 10,
        name = "The Grill House",
        description = "Los mejores cortes de carne a la parrilla.",
        imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947",
        categories = listOf("Gourmet", "Carnes", "Vinos", "Asados"),
        menu = listOf(
            Dish(28, "Bife de Chorizo", "Corte de carne tierno y jugoso (300g).", "https://images.unsplash.com/photo-1546241072-48010ad28c2c"),
            Dish(29, "Parrillada Familiar", "Selección de carnes y embutidos para compartir.", "https://images.unsplash.com/photo-1555939594-58d7cb561ad1"),
            Dish(30, "Vino Malbec", "Copa de vino tinto ideal para acompañar carnes.", "https://images.unsplash.com/photo-1510812431401-41d2bd2722f3")
        )
    )
)