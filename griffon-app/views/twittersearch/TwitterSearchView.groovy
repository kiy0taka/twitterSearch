package twittersearch

import static java.awt.BorderLayout.*
import groovy.model.ValueHolder

application(title: 'TwitterSearch',
  preferredSize: [350, 400],
  pack: true,
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {

    panel(constraints:NORTH) {
       textField columns:15, text:bind(target:model, 'searchText'), enabled:bind{!model.searching}
       button '検索', actionPerformed:controller.&search, enabled:bind{model.searchText && !model.searching}
    }
    def rowsModel = new ValueHolder()
    scrollPane(constraints:CENTER) {
       table {
           tableModel(id:'searchResult', rowsModel:rowsModel) {
               propertyColumn header: 'User', propertyName: 'fromUser'
               propertyColumn header: 'Tweet', propertyName: 'text'
           }
       }
    }
    bean rowsModel, value:bind{model.tweets}
    progressBar constraints:SOUTH, visible:bind{model.searching}, indeterminate:bind{model.searching}

}
