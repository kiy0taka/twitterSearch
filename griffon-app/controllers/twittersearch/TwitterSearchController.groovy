package twittersearch

import twitter4j.*

class TwitterSearchController {

    def model
    def view
    def twitter

    def search = {
        model.tweets = twitter.search(new Query(model.searchText)).tweets
        view.searchResult.fireTableDataChanged()
    }
}