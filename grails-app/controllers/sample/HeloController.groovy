package sample

class HeloController {

    def index() {
    	//render "<html><body><h1>Helo</h1><p>welcome to Grails!</p></body></html>"
    	[
    	'title':"Sample Page",
        'msg':"This is sample page",
        'date':Calendar.getInstance().getTime()
    	]
    }
}
