package com.jaewoo.pattern.iterator;

public interface ChannelCollection {
    void addChannel(Channel c);
    
    void removeChannel(Channel c);
     
    ChannelIterator iterator(ChannelTypeEnum type);
}
