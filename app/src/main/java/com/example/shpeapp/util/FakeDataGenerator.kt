package com.example.shpeapp.util

import com.example.shpeapp.data.Event
import com.github.javafaker.Faker

object FakeDataGenerator {
    private val faker = Faker()

    fun generateFakeEvents(count: Int): List<Event> {
        val events = mutableListOf<Event>()
        for (i in 0 until count) {
            val event = Event(
                title = faker.book().title(),
                detail = faker.lorem().sentence(),
                dateTime = faker.date().future(30, java.util.concurrent.TimeUnit.DAYS).time,
                location = faker.address().fullAddress(),
                signInLink = faker.internet().url()
            )
            events.add(event)
        }
        return events
    }
}

