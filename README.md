**THIS HAS BEEN SUPERCEDED BY https://github.com/cameron-martin/renovate-module-bazel-lock-repro FORKED TO https://github.com/renovate-reproductions/25557...**

# 25557

Reproduction for [Renovate issue #25557](https://github.com/renovatebot/renovate/issues/25557).

## Current behavior

Renovate does not include changes to `MODULE.bazel.lock` in its PRs.

## Expected behavior

Renovate should include changes to `MODULE.bazel.lock` in its PRs.

## Link to the Renovate issue or Discussion

* https://github.com/renovatebot/renovate/discussions/31382
* https://github.com/renovatebot/renovate/issues/25557

## How To Reproduce

Renovate's initial PRs #1 & #2 illustrate the problem - they bump the `.bazelversion` (#1) respectively something in the `MODULE.bazel` (#2) - but they do not include the `MODULE.bazel.lock` file.

To see how those version bumps actually do modify the `MODULE.bazel.lock`, one can:

1. [Install Bazelisk](https://github.com/bazelbuild/bazelisk?tab=readme-ov-file#installation)
1. Clone this Reproduce
1. Edit the `.bazelversion` file, and bump 7.4.1 to 8.0.0 (as the PR does)
1. `bazelisk run //:JavaOne`
1. `git status`

This will show the `MODULE.bazel.lock` file, which is committed to Git, as being "dirty" (i.e. having been modified by the version bump).

What we are saying with this Reproduction is that Renovate should include that `MODULE.bazel.lock` file in its PRs.
