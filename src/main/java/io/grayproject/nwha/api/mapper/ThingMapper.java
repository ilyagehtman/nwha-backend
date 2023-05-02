package io.grayproject.nwha.api.mapper;

import io.grayproject.nwha.api.domain.Thing;
import io.grayproject.nwha.api.dto.ThingDTO;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.function.Function;

/**
 * @author Ilya Avkhimenya
 */
@Component
public class ThingMapper implements Function<Thing, ThingDTO> {

    @Override
    public ThingDTO apply(Thing thing) {

        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String addedDate = simpleDateFormat.format(thing.getCreatedAt());

        return ThingDTO
                .builder()
                .id(thing.getId())
                .profileId(thing.getProfileTask().getProfile().getId())
                .archived(thing.isArchived())
                .description(thing.getDescription())
                .profileTaskId(thing.getProfileTask().getId())
                .addedDate(addedDate)
                .fileUrl(thing.getFileUrl())
                .build();
    }
}
