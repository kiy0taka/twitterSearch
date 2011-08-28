package twittersearch

class TwitterSearchController {

    def model
    def view

    def search = {
        model.tweets = [
            [fromUser:'kiy0taka', text:'Griffonなう。'],
            [fromUser:'kiy0taka', text:'@groovybook Gマガ読んだよ！']
        ]
        view.searchResult.fireTableDataChanged()
    }
}