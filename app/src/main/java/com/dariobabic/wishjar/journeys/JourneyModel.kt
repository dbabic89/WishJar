package com.dariobabic.wishjar.journeys

data class JourneyModel(
    val title: String
)

fun getJourneys(): List<JourneyModel> {
    val journey1 = JourneyModel("Paris")
    val journey2 = JourneyModel("London")
    val journey3 = JourneyModel("Lisbon")
    val journey4 = JourneyModel("Copenhagen")
    val journey5 = JourneyModel("Budapest")
    return listOf(journey1, journey2, journey3, journey4, journey5)
}