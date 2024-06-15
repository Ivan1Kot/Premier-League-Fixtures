package com.ivankot.premierleaguefixtures

class FootballMatch(public var homeTeamScore: Int = 0, public var awayTeamScore: Int = 0) {

    override fun toString(): String {
        return "FootballMatch: HomeTeamScore($homeTeamScore), AwayTeamScore($awayTeamScore)"
    }

    public fun setTeamScore(team: Team, score: Int) { //TODO: Use this
        when (team) {
            Team.HOME -> homeTeamScore = score
            Team.AWAY -> awayTeamScore = score
        }
    }
}