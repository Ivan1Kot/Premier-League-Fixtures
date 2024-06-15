package com.ivankot.premierleaguefixtures

import kotlin.math.abs

fun main() //TODO: Set up the environment to run this function
{
    val matches = Array(10) { FootballMatch((0..5).random(), (0..5).random()) }

    println("Matches")
    for (match in matches) println(match)

    println("\nMatches Without Draw")
    val matchesWithoutDraw =
        matches.toList()
            .filter { it.homeTeamScore != it.awayTeamScore }
            .forEach { println(it) }

    println("\nMax Goal Gap Matches")
    val maxGoalGapMatchScore = matches.maxOf { abs(it.homeTeamScore - it.awayTeamScore) }
    val maxGoalGapMatches =
        matches.filter { abs(it.homeTeamScore - it.awayTeamScore) == maxGoalGapMatchScore }
            .toSet()
            .forEach { println(it) }
}