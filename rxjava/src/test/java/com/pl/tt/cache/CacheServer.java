package com.pl.tt.cache;

import com.pl.tt.util.Sleeper;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;

import java.time.Duration;

public class CacheServer {

	private static final Logger log = LoggerFactory.getLogger(CacheServer.class);

	public String findBy(long key) {
		log.info("Loading from Memcached: {}", key);
		Sleeper.sleep(Duration.ofMillis(RandomUtils.nextInt(100, 200)));
		log.info("Cache hit for: {}", key);
		return "<data>" + key + "</data>";
	}

	public Observable<String> rxFindBy(long key) {
		return Observable.fromCallable(() -> findBy(key));
	}

}
