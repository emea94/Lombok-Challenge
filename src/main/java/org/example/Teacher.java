package org.example;

import lombok.Builder;
import lombok.With;
@Builder
public record Teacher(
        String ID,
        @With String name,
        String subject
) {
}
