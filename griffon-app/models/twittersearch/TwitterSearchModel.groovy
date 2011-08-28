package twittersearch

import groovy.beans.Bindable

class TwitterSearchModel {
    @Bindable String searchText
    @Bindable List tweets
    @Bindable boolean searching
}
