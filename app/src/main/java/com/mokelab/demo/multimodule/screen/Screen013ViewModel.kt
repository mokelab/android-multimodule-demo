package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data121RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data122RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data123RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data124RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data125RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data126RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data127RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data128RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data129RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data130RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen013ViewModel @Inject constructor(
    private val repo1: Data121RepositoryImpl,
    private val repo2: Data122RepositoryImpl,
    private val repo3: Data123RepositoryImpl,
    private val repo4: Data124RepositoryImpl,
    private val repo5: Data125RepositoryImpl,
    private val repo6: Data126RepositoryImpl,
    private val repo7: Data127RepositoryImpl,
    private val repo8: Data128RepositoryImpl,
    private val repo9: Data129RepositoryImpl,
    private val repo10: Data130RepositoryImpl,

): ViewModel() {
}
