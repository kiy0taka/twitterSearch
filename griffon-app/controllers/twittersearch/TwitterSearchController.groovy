package twittersearch

import twitter4j.*

class TwitterSearchController {

    def model
    def view
    def twitter

    def search = {
        def tweets = twitter.search(new Query(model.searchText)).tweets
        execAsync {
            model.tweets = tweets
            view.searchResult.fireTableDataChanged()
        }
    }
}