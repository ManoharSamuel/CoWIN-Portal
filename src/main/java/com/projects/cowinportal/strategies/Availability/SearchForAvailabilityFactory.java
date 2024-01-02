package com.projects.cowinportal.strategies.Availability;

public class SearchForAvailabilityFactory {
    public static SearchForAvailability getSearchForAvailability(SearchType searchType) {
        return switch (searchType) {
            case DATE -> new SearchForAvailabilityByDate();
            case HOSPITAL -> new SearchForAvailabilityByHopsital();
        };
    }
}
