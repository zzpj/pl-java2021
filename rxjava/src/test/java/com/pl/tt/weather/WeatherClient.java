package com.pl.tt.weather;

import com.pl.tt.util.Sleeper;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class WeatherClient {

	private static final Logger log = LoggerFactory.getLogger(WeatherClient.class);

	public Weather fetch(String city) {
		log.info("Loading for {}", city);
		Sleeper.sleep(Duration.ofMillis(RandomUtils.nextInt(900, 950)));
		//HTTP, HTTP, HTTP
		log.info("Done: {}", city);
		return new Weather();
	}

}
