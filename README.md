***
# NOTICE:

## This repository has been archived and is not supported.

[![No Maintenance Intended](http://unmaintained.tech/badge.svg)](http://unmaintained.tech/)
***
NOTICE: SUPPORT FOR THIS PROJECT HAS ENDED 

This projected was owned and maintained by Walmart. This project has reached its end of life and Walmart no longer supports this project.

We will no longer be monitoring the issues for this project or reviewing pull requests. You are free to continue using this project under the license terms or forks of this project at your own risk. This project is no longer subject to Walmart's bug bounty program or other security monitoring.


## Actions you can take

We recommend you take the following action:

  * Review any configuration files used for build automation and make appropriate updates to remove or replace this project
  * Notify other members of your team and/or organization of this change
  * Notify your security team to help you evaluate alternative options

## Forking and transition of ownership

For [security reasons](https://www.theregister.co.uk/2018/11/26/npm_repo_bitcoin_stealer/), Walmart does not transfer the ownership of our primary repos on Github or other platforms to other individuals/organizations. Further, we do not transfer ownership of packages for public package management systems.

If you would like to fork this package and continue development, you should choose a new name for the project and create your own packages, build automation, etc.

Please review the licensing terms of this project, which continue to be in effect even after decommission.

This is the unstable development branch. See the
[stable branch](https://github.com/pallet/pallet/tree/support/0.7.x) for
production code.

[Pallet][palletops] is used to provision and maintain servers on cloud and
virtual machine infrastructure, and aims to solve the problem of providing a
consistently configured running image across a range of clouds.  It is designed
for use from the [Clojure][clojure] REPL, from clojure code, and from the
command line.

- reuse configuration in development, testing and production.
- store all your configuration in a source code management system (eg. git),
  including role assignments.
- configuration is re-used by composition; just create new functions that call
  existing crates with new arguments. No copy and modify required.
- enable use of configuration crates (recipes) from versioned jar files.

It uses [jclouds][jclouds] to gain portable access to different cloud providers.

[Documentation][docs] is available.

## Crates

Pallet installation and configuration for various software packages is provided
via crates.  For pallet 0.4.x through 0.6.x, the crates are in the
[pallet-crates](https://github.com/pallet/pallet-crates) repo. For 0.7.x and
on, each crate is in its own repository.

## Support

On the [mailing list][ml], or #pallet on freenode irc.

## Usage

The main [documentation][docs] is on the [PalletOps][palletops] site.

## Installation

Pallet is distributed as a jar, and is available in the
[sonatype repository][sonatype].

Installation is with maven or your favourite maven repository aware build tool.

### lein project.clj

```clojure
:dependencies [[com.palletops/pallet "0.8.0-RC.5"]]
```

### maven pom.xml

```xml
<dependencies>
  <dependency>
    <groupId>com.palletops</groupId>
    <artifactId>pallet</artifactId>
    <version>0.8.0-RC.5</version>
  </dependency>
<dependencies>

<repositories>
  <repository>
    <id>clojars</id>
    <url>http://clojars.org/repo</url>
  </repository>
</repositories>
```

## See also

[chef][chef], and [puppet][puppet] are other infrastructure automation tools.

## License

Licensed under [EPL](http://www.eclipse.org/legal/epl-v10.html)

[Contributors](https://www.ohloh.net/p/pallet-clj/contributors)

Copyright 2010, 2011, 2012  Hugo Duncan.


[palletops]: http://palletops.com "Pallet site"

[docs]: http://palletops.com/doc "Pallet Documentation"
[ml]: http://groups.google.com/group/pallet-clj "Pallet mailing list"
[basicdemo]: https://github.com/pallet/pallet-examples/blob/develop/basic/src/demo.clj "Basic interactive usage of Pallet"
[basic]: https://github.com/pallet/pallet-examples/tree/develop/basic/ "Basic Pallet Examples"
[screencast]: http://www.youtube.com/hugoduncan#p/u/1/adzMkR0d0Uk "Pallet Screencast"
[clojure]: http://clojure.org "Clojure"
[cljstart]: http://dev.clojure.org/display/doc/Getting+Started "Getting started with clojure"
[sonatype]: http://oss.sonatype.org/content/repositories/releases/org/cloudhoist "Sonatype Maven Repository"

[jclouds]: http://jclouds.org/ "jclouds"
[chef]: http://opscode.com/ "Chef"
[puppet]: http://www.puppetlabs.com/ "Puppet"
