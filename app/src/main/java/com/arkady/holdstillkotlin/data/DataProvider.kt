package com.arkady.holdstillkotlin.data

class DataProvider {
    companion object {
        fun getMockData(): List<ExampleModel> {
            val exampleModelList = ArrayList<ExampleModel>()

            var example = ExampleModel(
                    "JUST DO THIS",
                    "SHOPPING GALLERY - 1",
                    "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm.",
                    "BUY",
                    "https://assets.wired.com/photos/w_1200/wp-content/uploads/2016/09/nike_vapormax-profile.png")
            exampleModelList.add(example)

            example = ExampleModel(
                    "JUST DO THAT",
                    "SHOPPING GALLERY - 2",
                    "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm.",
                    "SOLD OUT",
                    "http://www.bayareakicks.com/wp-content/uploads/2013/04/Nike-Roshe-Run-Squadron-Blue-5.jpg")
            exampleModelList.add(example)

            example = ExampleModel(
                    "JUST DO IT",
                    "SHOPPING GALLERY - 3",
                    "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm.",
                    "LOW STOCK",
                    "https://www.wired.com/wp-content/uploads/2016/09/nike_hyperadapt-profile_angle-feat-1-1200x630-e1474318704769.jpg")
            exampleModelList.add(example)

            example = ExampleModel(
                    "JUST DO IT",
                    "LAST PAGE OF YOUR SHOPPING GALLERY",
                    "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm.",
                    "BUY",
                    "https://i.pinimg.com/originals/18/81/ab/1881ab02b96ddb17d8170a48bce89028.jpg")
            exampleModelList.add(example)

            return exampleModelList
        }
    }
}

