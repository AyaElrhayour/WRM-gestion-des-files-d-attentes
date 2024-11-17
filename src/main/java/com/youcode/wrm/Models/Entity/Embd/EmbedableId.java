package com.youcode.wrm.Models.Entity.Embd;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Embeddable
@RequiredArgsConstructor
@NoArgsConstructor
public class EmbedableId implements Serializable {

    private static final Long serialVersionUID = 1L;

    @NonNull
    @Column(name = "visitorId")
    private UUID visitorId;

    @NonNull
    @Column(name = "waitingListId")
    private UUID waitingListId;
}
