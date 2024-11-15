package com.youcode.wrm.Modles.Entity.Embd;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class EmbedableId {

    @Column(name = "visitorId")
    private String visitorId;

    @Column(name = "waitingListId")
    private String waitingListId;
}
