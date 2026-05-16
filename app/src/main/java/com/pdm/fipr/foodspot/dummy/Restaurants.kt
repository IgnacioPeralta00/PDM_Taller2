package com.pdm.fipr.foodspot.dummy

import com.pdm.fipr.foodspot.model.Dish
import com.pdm.fipr.foodspot.model.Restaurant

val dummyRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizzeria Italia",
        description = "Auténtica pizza napolitana preparada en horno de leña con ingredientes importados.",
        imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591",
        categories = listOf("Italiana", "Comida Rápida"),
        menu = listOf(
            Dish(1, "Pizza Margherita", "Tomate San Marzano, mozzarella de búfala y albahaca fresca.", "https://plus.unsplash.com/premium_photo-1679924471066-dd984e92f395?q=80&w=764&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(2, "Pizza Pepperoni", "Mozzarella y abundante pepperoni crujiente.", "https://images.unsplash.com/photo-1628840042765-356cda07504e"),
            Dish(3, "Calzone Tradicional", "Pizza cerrada rellena de ricotta, jamón y queso.", "https://images.unsplash.com/photo-1753656681797-3234c89d6d4d?q=80&w=1171&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        )
    ),
    Restaurant(
        id = 6,
        name = "Pasta & Co.",
        description = "Variedad de pastas frescas con salsas tradicionales italianas.",
        imageUrl = "https://images.unsplash.com/photo-1473093226795-af9932fe5856",
        categories = listOf("Italiana"),
        menu = listOf(
            Dish(16, "Spaghetti Carbonara", "Pasta con huevo, queso pecorino y guanciale.", "https://images.unsplash.com/photo-1598866594230-a7c12756260f?q=80&w=1008&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(17, "Lasagna Boloñesa", "Capas de pasta rellenas de carne y salsa bechamel.", "https://plus.unsplash.com/premium_photo-1723770033472-0b0452d98225?q=80&w=1097&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(18, "Fettuccine Alfredo", "Pasta con salsa cremosa de mantequilla y parmesano.", "https://images.unsplash.com/photo-1645112411341-6c4fd023714a?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        )
    ),
    Restaurant(
        id = 11,
        name = "La Pizzetta",
        description = "Pizzas artesanales de masa delgada listas en minutos.",
        imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee",
        categories = listOf("Italiana", "Comida Rápida"),
        menu = listOf(
            Dish(31, "Pizza Prosciutto", "Salsa de tomate, mozzarella, jamón serrano y rúcula.", "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee"),
            Dish(32, "Pan de Ajo Especial", "Pan horneado con mantequilla de ajo y mozzarella fundida.", "https://images.unsplash.com/photo-1558679582-7fe9071024c9?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(37, "Bruschetta Tradicional", "Pan tostado con tomate picado, ajo, albahaca y un toque de aceite de oliva.", "https://images.unsplash.com/photo-1572656631137-7935297eff55")
        )
    ),
    Restaurant(
        id = 2,
        name = "Burger King",
        description = "Disfruta del auténtico sabor a la parrilla en cada hamburguesa.",
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(4, "Whopper", "La clásica hamburguesa con carne 100% a la parrilla.", "https://images.unsplash.com/photo-1568901346375-23c9450c58cd"),
            Dish(5, "Papas Fritas XL", "Porción grande de papas doradas y crujientes.", "https://images.unsplash.com/photo-1585109649139-366815a0d713?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(6, "Aros de Cebolla", "Crujientes aros de cebolla empanizados.", "https://images.unsplash.com/photo-1639024471283-03518883512d")
        )
    ),
    Restaurant(
        id = 4,
        name = "Tacos El Guero",
        description = "Sabor tradicional mexicano en cada mordida. ¡Los mejores tacos de la zona!",
        imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(10, "Tacos al Pastor", "Cerdo marinado con piña, cilantro y cebolla.", "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b"),
            Dish(11, "Gringa de Pastor", "Tortilla de harina con queso fundido y carne al pastor.", "https://plus.unsplash.com/premium_photo-1681406994990-e16f7e02e027?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(12, "Quesadilla Especial", "Tortilla de maíz con queso y champiñones.", "https://images.unsplash.com/photo-1593560708920-61dd98c46a4e")
        )
    ),
    Restaurant(
        id = 3,
        name = "Sushi Master",
        description = "Fusión de sabores orientales con los mejores ingredientes del mar.",
        imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c",
        categories = listOf("Asiática"),
        menu = listOf(
            Dish(7, "California Roll", "Cangrejo, aguacate, pepino y sésamo.", "https://images.unsplash.com/photo-1579584425555-c3ce17fd4351"),
            Dish(8, "Dragon Roll", "Anguila, tempura de langostino y cobertura de aguacate.", "https://images.unsplash.com/photo-1553621042-f6e147245754"),
            Dish(9, "Nigiri Salmón", "Láminas de salmón fresco sobre arroz avinagrado.", "https://images.unsplash.com/photo-1583623025817-d180a2221d0a")
        )
    ),
    Restaurant(
        id = 7,
        name = "Oriental Wok",
        description = "Platos salteados al momento con el mejor sabor asiático.",
        imageUrl = "https://images.unsplash.com/photo-1529690678884-189e81f34ef6?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Asiática"),
        menu = listOf(
            Dish(19, "Pad Thai", "Fideos de arroz con camarones, huevo y maní.", "https://images.unsplash.com/photo-1637806931098-af30b519be53?q=80&w=685&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(20, "Pollo Kung Pao", "Pollo con chiles, cacahuates y verduras.", "https://images.unsplash.com/photo-1525755662778-989d0524087e"),
            Dish(21, "Rollitos de Primavera", "Rollitos crujientes rellenos de vegetales.", "https://images.unsplash.com/photo-1544025162-d76694265947")
        )
    ),
    Restaurant(
        id = 12,
        name = "Ramen House",
        description = "El auténtico sabor del ramen tradicional japonés en caldos complejos de larga cocción.",
        imageUrl = "https://images.unsplash.com/photo-1569718212165-3a8278d5f624",
        categories = listOf("Asiática"),
        menu = listOf(
            Dish(33, "Tonkotsu Ramen", "Caldo espeso de cerdo, fideos artesanales, chashu y huevo nitamago.", "https://images.unsplash.com/photo-1569718212165-3a8278d5f624"),
            Dish(34, "Gyoza de Cerdo", "Empanadillas japonesas a la plancha rellenas de cerdo y vegetales.", "https://images.unsplash.com/photo-1563245372-f21724e3856d"),
            Dish(38, "Yakitori de Pollo", "Brochetas de pollo y cebollín glaseadas con salsa tare dulce.", "https://images.unsplash.com/photo-1708597525178-6c302364f37c?q=80&w=1932&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        )
    ),
    Restaurant(
        id = 8,
        name = "Mariscos El Faro",
        description = "Pescados y mariscos frescos traídos directamente del puerto.",
        imageUrl = "https://images.unsplash.com/photo-1615141982883-c7ad0e69fd62?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Carnes y Mariscos"),
        menu = listOf(
            Dish(22, "Ceviche Peruano", "Pescado marinado en limón con cebolla y ají.", "https://images.unsplash.com/photo-1652498199372-30dfd622ceef?q=80&w=735&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(23, "Arroz con Camarones", "Arroz sazonado con abundantes camarones frescos.", "https://images.unsplash.com/photo-1551326844-4df70f78d0e9?q=80&w=1026&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(24, "Tiradito de Pescado", "Finas láminas de pescado en salsa cítrica.", "https://images.unsplash.com/photo-1700481932999-4bba65731015?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        )
    ),
    Restaurant(
        id = 10,
        name = "The Grill House",
        description = "Los mejores cortes de carne a la parrilla.",
        imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947",
        categories = listOf("Carnes y Mariscos"),
        menu = listOf(
            Dish(28, "Bife de Chorizo", "Corte de carne tierno y jugoso (300g).", "https://plus.unsplash.com/premium_photo-1723478679050-453af0ba3e41?q=80&w=762&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(29, "Parrillada Familiar", "Selección de carnes y embutidos para compartir.", "https://images.unsplash.com/photo-1555939594-58d7cb561ad1"),
            Dish(30, "Vino Malbec", "Copa de vino tinto ideal para acompañar carnes.", "https://images.unsplash.com/photo-1510812431401-41d2bd2722f3")
        )
    ),
    Restaurant(
        id = 5,
        name = "Fresh Garden",
        description = "Opciones saludables a la plancha y frescas para cuidar tu cuerpo.",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd",
        categories = listOf("Carnes y Mariscos", "Postres y Café"),
        menu = listOf(
            Dish(13, "Ensalada César con Pollo", "Lechuga romana, pechuga de pollo a la parrilla, croutones y aderezo césar.", "https://images.unsplash.com/photo-1550304943-4f24f54ddde9"),
            Dish(14, "Salmon Quinoa Bowl", "Mezcla de quinoa con vegetales asados y un filete de salmón fresco a la plancha.", "https://images.unsplash.com/photo-1546069901-ba9599a7e63c"),
            Dish(15, "Smoothie Detox", "Zumo de espinaca, manzana verde y jengibre.", "https://images.unsplash.com/photo-1610970881699-44a5587cabec")
        )
    ),
    Restaurant(
        id = 9,
        name = "Sweet Moments",
        description = "Endulza tu día con nuestros postres artesanales y repostería fina.",
        imageUrl = "https://images.unsplash.com/photo-1509042239860-f550ce710b93",
        categories = listOf("Postres y Café"),
        menu = listOf(
            Dish(25, "Cheesecake de Arándanos", "Base de galleta crujiente con crema de queso y arándanos.", "https://images.unsplash.com/photo-1533134242443-d4fd215305ad"),
            Dish(26, "Tiramisú", "Postre italiano con café, mascarpone y cacao.", "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9"),
            Dish(27, "Frappé de Caramelo", "Café helado con salsa de caramelo y nata.", "https://images.unsplash.com/photo-1534778101976-62847782c213")
        )
    ),
    Restaurant(
        id = 13,
        name = "Café Central",
        description = "Granos seleccionados, panadería recién horneada y el mejor ambiente para tu café diario.",
        imageUrl = "https://images.unsplash.com/photo-1555507036-ab1f4038808a",
        categories = listOf("Postres y Café"),
        menu = listOf(
            Dish(35, "Capuccino Supremo", "Espresso intenso con leche vaporizada sedosa y un toque de canela.", "https://images.unsplash.com/photo-1534778101976-62847782c213"),
            Dish(36, "Croissant de Almendras", "Hojaldre crujiente relleno de crema frangipane de almendras.", "https://images.unsplash.com/photo-1555507036-ab1f4038808a"),
            Dish(39, "Espresso Macchiato", "Una carga de espresso corto con una delicada capa de espuma de leche.", "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085")
        )
    )
)