package com.youcode.wrm.Modles.Entity.Embd;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.UUID;

@Embeddable
@Data
public class EmbedableId {

    @Column(name = "visitorId")
    private UUID visitorId;

    @Column(name = "waitingListId")
    private UUID waitingListId;
}
