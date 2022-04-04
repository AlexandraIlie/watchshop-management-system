package com.endava.project.watchshop.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Order {

    private LocalDateTime dateTime;
    private List<Watch> orderedWatches;
}
