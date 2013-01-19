package com.sumologic.client.searchjob.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.sumologic.client.model.HttpGetRequest;

/**
 * @author Christian Beedgen (christian@sumologic.com)
 */
public final class GetRecordsForSearchJobRequest implements HttpGetRequest {

    // Instance fields.

    private String id;
    private int offset;
    private int length;

    // Implementation.

    /**
     * Creates a new messages for search job request.
     *
     * @param id     The search job ID.
     * @param offset The offset.
     * @param length The length.
     */
    public GetRecordsForSearchJobRequest(String id, int offset, int length) {
        this.id = id;
        this.offset = offset;
        this.length = length;
    }

    /**
     * Return the search job ID.
     *
     * @return The search job ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the search job ID.
     *
     * @param id The search job ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the offset.
     *
     * @return The offset.
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the offset.
     *
     * @param offset The offset.
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * Returns the length.
     *
     * @return The length.
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the length.
     *
     * @param length The length.
     */
    public void setLength(int length) {
        this.length = length;
    }

    // HttpGetRequest implementation.

    @Override
    public List<NameValuePair> toUrlParams() {
        List<NameValuePair> result = new ArrayList<NameValuePair>(2);
        result.add(new BasicNameValuePair("offset", Integer.toString(offset)));
        result.add(new BasicNameValuePair("length", Integer.toString(length)));
        return result;
    }
}