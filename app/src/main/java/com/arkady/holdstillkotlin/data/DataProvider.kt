package com.arkady.holdstillkotlin.data

class DataProvider {
    companion object {
        fun getMockData(): List<ExampleModel> {
            val exampleModelList = ArrayList<ExampleModel>()

            var example = ExampleModel()
            example.mainText = "JUST DO THIS"
            example.topText = "SHOPPING GALLERY - 1"
            example.shopInfo = "BUY"
            example.infoText = "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm."
            example.imageUrl = "https://assets.wired.com/photos/w_1200/wp-content/uploads/2016/09/nike_vapormax-profile.png"
            exampleModelList.add(example)

            example = ExampleModel()
            example.mainText = "JUST DO THAT"
            example.topText = "SHOPPING GALLERY - 2"
            example.shopInfo = "SOLD OUT"
            example.infoText = "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm."
            example.imageUrl = "http://www.bayareakicks.com/wp-content/uploads/2013/04/Nike-Roshe-Run-Squadron-Blue-5.jpg"
            exampleModelList.add(example)

            example = ExampleModel()
            example.mainText = "JUST DO IT"
            example.topText = "SHOPPING GALLERY - 3"
            example.shopInfo = "LOW STOCK"
            example.infoText = "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm."
            example.imageUrl = "https://www.wired.com/wp-content/uploads/2016/09/nike_hyperadapt-profile_angle-feat-1-1200x630-e1474318704769.jpg"
            exampleModelList.add(example)

            example = ExampleModel()
            example.mainText = "THE END"
            example.topText = "LAST PAGE OF YOUR SHOPPING GALLERY"
            example.shopInfo = "BUY"
            example.infoText = "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm."
            example.imageUrl = "https://i.pinimg.com/originals/18/81/ab/1881ab02b96ddb17d8170a48bce89028.jpg"
            exampleModelList.add(example)

            return exampleModelList
        }
    }
}

