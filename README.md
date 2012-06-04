# gatekeeper

Mozilla Persona (BrowserID) aims to be a better, more usable and more privacy-conscious
implementation of OpenID. 
* [BrowserID Project Documentation at MDN](https://developer.mozilla.org/en/BrowserID#The_BrowserID_Project)
* [BrowserID Quick Setup Guide](https://developer.mozilla.org/en/BrowserID/Quick_Setup)

Clojurescript, event handling and relevant client server integration with Clojure. 
* Setting up with Clojurescript with the [Clojurescript quick start](https://github.com/clojure/clojurescript/wiki/Quick-Start)
* DOM manipulation uses the excellent Clojurescript JQuery wrapper library known as [Jayq library](https://github.com/ibdknox/jayq)
* Document markup is handled (mostly) by a client side Hiccup implementation called [Crate library](https://github.com/ibdknox/crate)
* Ajax/Ahah XHR client-server integration is implemented using the Clojurescript [Fetch library](https://github.com/ibdknox/fetch)
* Using [Clojurescript with Noir](http://www.chris-granger.com/2012/02/20/overtone-and-clojurescript/)

Finally, [Noir](https://github.com/ibdknox/webnoir) is [Chris Granger's](https://github.com/ibdknox) web development library which uses Ring and Compojure.

## Running

To try it out yourself, clone this and run:

```bash
lein clean, deps, compile, cljsbuild once, run
```

And visit:

http://localhost:8000/login

Clicking on the sign-in image should do the dance with browserid.org.
Once you sign in, refreshing the page should detect an authenticated
sign-in. It could use polish, which I might do in the next few days.

## Contributors

* Clojure.MN

## License

Copyright (C) 2012 hacker coop

This project is licensed under the Eclipse Public License, the same as Clojure.

