package twittersearch

class TwitterSearchController {

    def model
    def view

    def search = {
        view.searchResult.rowsModel.value = [
            [fromUser:'kiy0taka', text:'Griffonなう。'],
            [fromUser:'kiy0taka', text:'@groovybook Gマガ読んだよ！']
        ]
        view.searchResult.fireTableDataChanged()
    }
}