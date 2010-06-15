package com.meetup.memcached;

/**
 * Created by IntelliJ IDEA.
 * User: wouter
 * Date: Jun 11, 2010
 * Time: 12:31:13 PM
 * To change this template use File | Settings | File Templates.
 * <p/>
 * class Entry
 * attr_reader :value
 * attr_reader :server
 * <p/>
 * def initialize(val, srv)
 *
 * @value = val
 * @server = srv
 * end
 * <p/>
 * def inspect
 * "<#{value}, #{server.host}:#{server.port}>"
 * end
 * end
 */
public class ContinuumEntry implements Comparable<ContinuumEntry>{


    private Long value;
    private String server;

    public ContinuumEntry(Long value, String server) {

        this.value = value;
        this.server = server;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int compareTo(ContinuumEntry o) {
        if(this.getValue() > o.getValue()) {
            return 1;
        } else if(this.getValue() < o.getValue()) {
            return -1;
        }
        return 0;
    }
}
