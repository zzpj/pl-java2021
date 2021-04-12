package com.pl.tt.ping;

public class Pinger {

	public Status healthy() {
		return Math.random() < 0.9 ? Status.UP : Status.DOWN;
	}

}

