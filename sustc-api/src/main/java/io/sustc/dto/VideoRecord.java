package io.sustc.dto;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class VideoRecord {

    /**
     * The BV code of this video
     */
    private String bv;

    /**
     * The title of this video
     */
    private String title;

    /**
     * The owner's {@code mid} of this video
     */
    private long ownerMid;

    /**
     * The owner's {@code name} of this video
     */
    private String ownerName;

    /**
     * The commit time of this video
     */
    private Timestamp commitTime;

    /**
     * The review time of this video, can be null
     */
    private Timestamp reviewTime;

    /**
     * The public time of this video, can be null
     */
    private Timestamp publicTime;

    /**
     * The length in seconds of this video
     */
    private float duration;

    /**
     * The description of this video
     */
    private String description;

    /**
     * The reviewer of this video, can be null
     */
    private Long reviewer;

    /**
     * The users' {@code mid}s who liked this video
     */
    private long[] like;

    /**
     * The users' {@code mid}s who gave coin to this video
     */
    private long[] coin;

    /**
     * The users' {@code mid}s who collected to this video
     */
    private long[] favorite;

    /**
     * The users' {@code mid}s who have watched this video
     */
    private long[] viewerMids;

    /**
     * The watch durations in seconds for the viewers {@code viewerMids}
     */
    private float[] viewTime;
}
