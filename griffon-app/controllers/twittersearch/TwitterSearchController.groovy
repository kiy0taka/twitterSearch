package twittersearch

import twitter4j.*

class TwitterSearchController {

    def model
    def view
    def twitter

    def search = {
        execSync {
            model.searching = true
        }
        def tweets = twitter.search(new Query(model.searchText)).tweets
        execAsync {
            model.tweets = tweets
            view.searchResult.fireTableDataChanged()
            model.searching = false
        }
    }
}