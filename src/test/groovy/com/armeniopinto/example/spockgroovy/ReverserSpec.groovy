package com.armeniopinto.example.spockgroovy

import spock.lang.*

class ReverserSpec extends Specification {

	def "Check if a string is a word"() {
		expect:
		Reverser.isWord(word) == result

		where:
		word		||	result
		""			||	true
		"a"			||	true
		"1"			||	false
		"hello"		||	true
		"hello1"	||	false
	}

	def "Check if a null string is a word throws an exception"() {
		when: "we check if a null string is a word"
		Reverser.isWord(null)

		then: "an NullPointerException must be thrown"
		thrown(NullPointerException)
	}
}
