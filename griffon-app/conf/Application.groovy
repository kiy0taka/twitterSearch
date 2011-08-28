application {
    title = 'TwitterSearch'
    startupGroups = ['twitterSearch']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "twitterSearch"
    'twitterSearch' {
        model      = 'twittersearch.TwitterSearchModel'
        view       = 'twittersearch.TwitterSearchView'
        controller = 'twittersearch.TwitterSearchController'
    }

}
