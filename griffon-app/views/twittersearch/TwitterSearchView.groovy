package twittersearch

import static java.awt.BorderLayout.*

application(title: 'TwitterSearch',
  preferredSize: [350, 400],
  pack: true,
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {

   panel(constraints:NORTH) {
       textField columns:15
       button '検索', actionPerformed: controller.&search
   }
   scrollPane(constraints:CENTER) {
       table {
           tableModel(id:'searchResult') {
               propertyColumn header: 'User', propertyName: 'fromUser'
               propertyColumn header: 'Tweet', propertyName: 'text'
           }
       }
   }
}
