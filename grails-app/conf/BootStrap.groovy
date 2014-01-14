import sample.SampleData

class BootStrap {

    def init = { servletContext ->
        if (!SampleData.count()) {
            def data1 = new SampleData(name:"hidemi", mail:"hidemi@example.com", age:20).save()
            def data2 = new SampleData(name:"fukamachi", mail:"fukamachi@example.co.jp", age:30).save()
            def data3 = new SampleData(name:"fuk", mail:"fuk@fukmail.ne.jp", age:40).save()
        }
    }

    def destroy = {
    }
}
