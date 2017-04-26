package com.dubboclub.dk.storage.api.disruptor;

import com.lmax.disruptor.RingBuffer;
import com.dubboclub.dk.storage.api.model.Statistics;

/**
 * StatisticsProducer
 * Created by bieber.bibo on 16/4/14
 * 统计数据的生产者,将统计的数据封装成disruptor的event
 */

public class StatisticsProducer {

    private final RingBuffer<StatisticsEvent> statisticsEventRingBuffer;

    public StatisticsProducer(RingBuffer<StatisticsEvent> statisticsEventRingBuffer) {
        this.statisticsEventRingBuffer = statisticsEventRingBuffer;
    }

    public void produce(Statistics statistics){
        long sequence = statisticsEventRingBuffer.next();
        try{
            StatisticsEvent statisticsEvent = statisticsEventRingBuffer.get(sequence);
            statisticsEvent.set(statistics);
        }finally {
            statisticsEventRingBuffer.publish(sequence);
        }
    }
}
